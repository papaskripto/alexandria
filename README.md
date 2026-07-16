# Alexandria
Multi-tenant library management system. Single application, multiple libraries.

## Features

### User Registration:
- A user creates an account.
- Their account represents their library.
### User login:
- Users login with their credentials.
- They're taken to their own library (to manage).
  
### Roles

#### Library Owner
- Create and manage library
- Add, edit, and delete books
- Record lending, returns, sales, and losses
- View library reports (only for their library)
#### Platform Admin
- View registered users
- Suspend or reactivate accounts
- Reset accounts
- Manage subscriptions
- View platform analytics
- Handle (abuse) reports
- Monitor system
- Send announcements

### Database Design (Scalable)

Users
-----
id
name
email
password
role
status
created_at

Libraries
---------
id
user_id
library_name
created_at

Books
-----
id
library_id
title
author
isbn
status
price
created_at

Transactions
------------
id
book_id
type
borrower
date
returned_date
notes

Relationships: Every books belongs to one library, and every library belongs to one user.

