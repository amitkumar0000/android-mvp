# android-mvp

Model View Presenter

Model : data and business logic resides

View : User Interface and notifies the presenter about user action

Presenter : Contoller is replaced by presenter .
            Presenter reterives/update the model data , applies the UI logic,
            and manags the state of Views. React to user notification for view.
            
In MVP
       Unlike MVC where view has controller and model reference. 
       In MVC, UI logic can be handle by view, controller and even model class. 
       In MVP , connection between model and view is broken.
       Now there is only one class presenter that take care of UI Logic.
