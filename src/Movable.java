public interface Movable {
    void move();        //In start the X-coordinate should be the first to increment, the X-coordinate should increase
                        // Depending on the speed of the car.

    //Should have 4 directions(intervall 1-4), so direction 1 is equal to X-positive coordinates. etc.
    // Needs to have a mod 4 variable, so that the direction never can go over the intervall 4

    void turnLeft();    //When first initialized the y-coordinate should increase instead, for example!

    void turnRight();   //Same thing similar to turnleft, when first used y coordinate should change. Then depending
                        //on what choice you make, X or Y should increase. since it only moves in x or y, both should, not
                        //be updated.
}

    //Every car should have direction attribute,

    //Move function should be something like" if currentspeed > 0;
                                                //"move x-cooridnate XorY-postition * currentspeed"
//Should we implement maybe two variables, one that controlls XorY direction, and one that checks if it is positive or negative