## Phase 1 

plaintext and textdecorator must share the same textcomponent interface so the can be used Interchangeably. 



## Phase 2

A decorator must call the inner components gettext metho d so every previously added decoration is presrved.


## Phase 3

This program follows the Open-Closed Principle because it is open for new
decorators but closed for changes to existing code. To add an
UnderlineDecorator, I would create a new class that extends TextDecorator.
None of the existing component or decorator classes would need to be modified.
