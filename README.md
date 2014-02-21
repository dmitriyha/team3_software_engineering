team3_software_engineering
==========================

This git repository is for the Inholland software engineering course in term 3, 2014

Overview for first official commit
==================================

-moved all files into one repo

-added web API for the profile class by making it a tag class (the class itself needs to be developed further).
currently called by `http://localhost:9090/profile?user="Username here"` as a GET request from your browser.

-added a "global" database class, called by `UserDatabase.get().//method name here`


Notes
=====

as the profile class is now a static tag class, gets for the database class must be added. Also, I moved the html folder into the 
a HTML folder into the repo for accessibility and development purposes.