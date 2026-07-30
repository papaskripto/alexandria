# multi-tenant library management system

a modern multi-tenant library management system built for organizations, schools, churches, businesses, and individuals who need to manage one or more libraries from a single platform.

each library operates independently while a Super Administrator manages the entire platform.

---

# features

## multi-tenant architecture

- multiple libraries on one platform
- complete data isolation between libraries
- each library has its own books, members, and staff
- secure tenant-based access control

---

# authentication

- user registration
- secure login
- password reset
- email verification
- role-based authorization

---

# user roles

## sudo admin

this the platform admin.

permissions:

- view all libraries
- suspend libraries
- reactivate libraries
- delete libraries
- view platform statistics
- manage users
- manage subscriptions
- access audit logs

---

## library owner

owns a library in the platform.

permissions:

- create and manage a library
- manage books
- manage members
- manage borrowing records
- invite staff
- view reports
- configure library settings

restrictions:

- cannot delete the library
- cannot access other libraries

---

## library staff

permissions:

- add books
- update books
- borrow books
- return books
- manage members

---

# library management

each library contains:

- library Profile
- books
- members
- staff
- borrowing history
- reports
- settings

---

# book management

manage books with complete inventory tracking.

each book has:

- title
- author
- isbn
- category
- publisher
- edition
- shelf location
- cover image
- quantity

inventory status:

- available
- borrowed
- lost
- sold
- damaged
- reserved

---

# member management

member info.

- name
- email
- phone
- membership number
- address
- registration Date
- active status

---

# borrowing system

track every borrowing transaction.

Features:

- borrow books
- return books
- due dates
- overdue tracking
- lost books
- damaged books
- borrowing history

---

# inventory tracking

track inventory through transactions.

examples:

- purchased
- donated
- borrowed
- returned
- sold
- lost
- damaged
- adjusted

---

# dashboard

each library dashboard displays:

- total titles
- total book copies
- books borrowed
- books available
- books lost
- books sold
- active members
- overdue books
- recent activity

---

# reports

generate reports for:

## inventory

- total books
- available books
- lost books
- sold books

## borrowing

- current borrowings
- returned books
- overdue books
- borrowing history

## members

- active members
- new registrations
- borrowing frequency

---

# library Status

libraries can have different states.

- active
- suspended
- archived
- deleted

suspended libraries:

- cannot log in
- cannot perform operations
- data remains intact
- can be restored by sudo

---

# soft delete

library owners cannot delete libraries.

instead:

1. owner requests deletion
2. sudo reviews request
3. library is archived
4. permanent deletion can occur after a retention period

this helps prevent accidental data loss and fraud.

---

# audit logs

every important action should be recorded such as:

- user login
- book added
- book edited
- book deleted
- book borrowed
- book returned
- member created
- library suspended
- settings changed

---

# db structure (might change in time)

```
users

libraries

library_users

books

book_transactions

members

borrowings

categories

authors

publishers

notifications

audit_logs

settings
```

---

# multi-tenant design

every tenant-owned table includes a `library_id` for complete separation between libraries.

Example:

```
Books
-------------
id
library_id
title
isbn
quantity
```
---

# security

- role-based access control (RBAC)
- tenant isolation
- secure password hashing
- authentication middleware
- authorization policies
- audit logging
- soft deletes
- input validation

---

# later

- barcode scanning
- QR code support
- ISBN lookup
- book cover retrieval
- email reminders
- SMS reminders
- mobile application
- public library catalog
- online reservations
- fine management
- subscription plans
- multi-branch libraries
- PDF reports
- excel exports
- automated backups
- API integrations

---

# technology stack

Frontend

- React
- Next.js
- Tailwind CSS

Backend

- springboot

DB

- postgreSQL

Authentication

- JWT

Storage (will pick one from these)

- local storage
- amazon S3
- cloudflare R2

---

# objective

to build a scalable SaaS platform where multiple independent libraries can manage:

- Books
- Members
- Borrowing
- Inventory
- Reports

while maintaining complete data isolation and centralized platform administration.

---

# license

see license!

---

# Contributing

tbd

---

# roadmap (ignore for now)

## phase 1

- authentication
- multi-tenancy
- library creation
- book management
- member management

## phase 2

- borrowing system
- reports
- notifications
- audit logs

## phase 3

- barcode support
- public catalog
- reservations
- fine management

## phase 4

- mobile app
- subscription billing
- multi-branch support
- REST API
