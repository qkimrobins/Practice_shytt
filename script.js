```javascript id="b12f9a"
// ===============================
// 🚀 Maze Runner Landing Script
// ===============================

// 🎯 Launch Button Action
function startApp() {
  // Replace this later with your actual app page
  alert("🚀 Launching Maze Visualizer...");

  // Example redirect (uncomment when ready)
  // window.location.href = "app.html";
}


// ===============================
// 🌊 Smooth Scroll for Navbar Links
// ===============================
document.querySelectorAll("nav a").forEach(link => {
  link.addEventListener("click", function (e) {
    e.preventDefault();

    const targetText = this.textContent.toLowerCase();

    if (targetText.includes("features")) {
      document.querySelector(".features").scrollIntoView({
        behavior: "smooth"
      });
    }

    if (targetText.includes("about")) {
      window.scrollTo({
        top: document.body.scrollHeight,
        behavior: "smooth"
      });
    }
  });
});


// ===============================
// ✨ Scroll Animation (Fade-in effect)
// ===============================
const observer = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add("show");
    }
  });
}, {
  threshold: 0.1
});

// Apply to all cards
document.querySelectorAll(".card").forEach(card => {
  card.classList.add("hidden");
  observer.observe(card);
});


// ===============================
// 🎨 Dynamic Glow Effect on Mouse Move
// ===============================
document.addEventListener("mousemove", (e) => {
  const x = e.clientX;
  const y = e.clientY;

  document.body.style.background = `
    radial-gradient(circle at ${x}px ${y}px, rgba(56,189,248,0.08), #020617 40%)
  `;
});


// ===============================
// ⌨️ Keyboard Shortcut (Pro Feature 🔥)
// ===============================
document.addEventListener("keydown", (e) => {
  if (e.key === "Enter") {
    startApp();
  }
});


// ===============================
// 🧪 Console Easter Egg (optional)
// ===============================
console.log("%cMaze Runner 🚀", "color:#38bdf8; font-size:18px; font-weight:bold;");
console.log("Built for DSA Visualization & Fun 😄");
```
