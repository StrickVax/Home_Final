# Home_Final

This program aims to streamline the reservation of home improvement. It asks for the
user’s specifications, and after guiding them through the steps, will output their selections onto a
.txt file.

It works by asking the user what professional they want to hire. After having a selection,
they will then be able to choose any date within a year. Afterwards, they will be asked for how
many hours they intend to keep the professional around. Once the user has the hours down, they
will be asked how many rooms they intend on improving. Lastly, they will be shown their
estimated cost. They will then be able to start over or print their selections onto a .txt file.

The target audience are homeowners who can only spare a few minutes online or are
hesitant to meet with a professional face-to-face.

Its biggest strength is its small file size. Despite its size, the user can select a myriad of
choices, with their choices automatically being saved onto their computers.

One of the glaring weaknesses of the program is its inability to store appointments, even
if the program is never closed. I may be able to resolve this by allowing it to scan a person’s
local disk and load an appropriately named .txt file containing all known reservations.

Another issue is that it is unable to take different working hours for different days.
Saturdays and Sunday’s hours are the same as the weekdays. I may be able to fix this by
importing a certain package, or by using % 7, given the local date.

The program has a relatively simple control system. While this does keep the file size
small, it is unable to make edits to the user’s selection. If, for instance, one decides to add
another room, they will have to abort the program and go back to the main menu. Recursion
might help.

# Pseudocode
START:

Function display menu

Pass in: Nothing

Displays the welcome menu

Pass out: Nothing


CALL: display menu

SET: flag = 1

DO:

Print options (Available professionals)

INPUT: flag

CASE profession number

Others

Print “Select profession with corresponding number”

ENDCASE

IF (flag > 0 and flag < 4)

CALL

ELSE

Print “Error, invalid selection”

WHILE flag != 0

Function Date_Selection

Pass in: Nothing

Displays a month and a day for the user to select

INPUT Month, Day

IF (Month and Day are valid)

CALL Hours

Function Hours

Pass in: Nothing

Displays a range of numbers. User selects two numbers, which will act as the range
