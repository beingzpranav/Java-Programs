# ☎️ PhoniBook – Contact Management System (Java Console App)

**PhoniBook** is a Java-based console application that mimics a simple contact management system. Users can add, search, delete, update, and view contacts in a terminal interface.

---

## 📋 Features

- 📥 Add new contacts (name and phone number)
- 🔍 Search for contacts by name
- ❌ Delete contacts by name
- 🔁 Update contact numbers
- 📜 Display all saved contacts (excluding deleted ones)
- 🧹 Marks deleted contacts internally (not removed from memory)

---

## 💡 How It Works

Upon launching the program, users are presented with a menu to perform any of the following operations:

### Menu Options:
1. Adding New Contacts
2. Searching Number
3. Deleting the Contacts
4. Updating the Contacts
5. Showing all the Contacts

The program runs in a loop, and the user can choose to continue or exit after each operation.

---

## ✅ Sample Output

![image](https://github.com/user-attachments/assets/8469d40b-9310-4310-a4db-b2fdb23ad6fc)


---

## 🛠 Technology Stack

- **Language:** Java  
- **Input:** `Scanner` for user interaction  
- **Data Structure:** 2D String array to store contacts as `[name, number]`  

---

## ⚠️ Limitations

- Only stores up to 100 contacts
- Contacts are stored in memory only (no database or file storage)
- Contacts marked as "deleted" are not actually removed, just hidden
- Case-sensitive input for names (e.g., `Ravi` ≠ `ravi`)

---

## 🔧 Future Improvements (Ideas)

- Implement file-based persistence
- Use `ArrayList` or `HashMap` for dynamic storage
- Add duplicate contact prevention
- Support for full name and multiple numbers per contact
- Case-insensitive search and update

---

## 👨‍💻 Author

[**Pranav Khandelwal**](https://pranavk.tech)  
Building practical CLI tools in Java to strengthen logic, structure, and usability in programming.
