# To-Do List Manager

tasks = []
#function to show to task
def show_tasks():
    if not tasks:
        print("\nNo tasks available.")
        return

    print("\n--- Your Tasks ---")
    for i, task in enumerate(tasks, start=1):
        status = "Completed" if task["completed"] else "Pending"
        print(f"{i}. {task['name']} - {status}")

# function to add task
def add_task():
    task_name = input("\nEnter task: ")
    tasks.append({"name": task_name, "completed": False})
    print("Task added successfully!")

# function to tell task is done 
def complete_task():
    show_tasks()

    if not tasks:
        return

    try:
        task_number = int(input("\nEnter task number to complete: "))

        if 1 <= task_number <= len(tasks):
            tasks[task_number - 1]["completed"] = True
            print("Task marked as completed!")
        else:
            print("Invalid task number.")

    except ValueError:
        print("Please enter a valid number.")

# function to delete task after completion
def delete_task():
    show_tasks()

    if not tasks:
        return

    try:
        task_number = int(input("\nEnter task number to delete: "))

        if 1 <= task_number <= len(tasks):
            deleted_task = tasks.pop(task_number - 1)
            print(f"Deleted: {deleted_task['name']}")
        else:
            print("Invalid task number.")

    except ValueError:
        print("Please enter a valid number.")


# Main program
while True:
    print("\n========================")
    print("   DAILY TO-DO MANAGER")
    print("========================")
    print("1. Add Task")
    print("2. View Tasks")
    print("3. Complete Task")
    print("4. Delete Task")
    print("5. Exit")

    choice = input("\nEnter your choice: ")

    if choice == "1":
        add_task()

    elif choice == "2":
        show_tasks()

    elif choice == "3":
        complete_task()

    elif choice == "4":
        delete_task()

    elif choice == "5":
        print("\nGoodbye! Have a productive day!")
        break

    else:
        print("\nInvalid choice. Please try again.")