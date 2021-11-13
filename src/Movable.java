public interface Movable {
    void move(); //In start the X-coordinate should be the first to increment, the X-cordinate should increase
    // Depending on the speed of the car.

    void turnLeft(); //When first initialized the y-coordinate should increase instead, for example!

    void turnRight(); //Same thing similar to turnleft, when first used y coordinate should change. Then depending
    //on what choice you make, X or Y should increase. since it only moves in x or y, both should, not
    //be updated.
}
