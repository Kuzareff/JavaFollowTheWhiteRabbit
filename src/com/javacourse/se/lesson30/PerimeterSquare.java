package com.javacourse.se.lesson30;

public class PerimeterSquare {

    public void getPerimeter (String str) throws PerimeterException {
        Square square = new Square();

        try {
        double side = Double.parseDouble(str);
            square.setSide(0);
        } catch (NumberFormatException e) {
            throw new PerimeterException("String is incerrect", e);
        } catch (PerimeterException ex) {
            ex.printStackTrace();
        }
    }
}
