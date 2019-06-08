/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int no_of_coffees = 2;

    /**
     * This method is called when increment is clicked
     */
    public void increment(View view)
    {
        no_of_coffees++;
        display(no_of_coffees);
    }
    /**
     * This method is called when decrement is clicked
     */
    public void decrement(View view)
    {
        if(no_of_coffees != 0)
            no_of_coffees--;
        display(no_of_coffees);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        displayMessage(createOrderSummary(no_of_coffees));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private String createOrderSummary(int number) {
        String message = "Name : Zishan Sheikh\nQuantity : " + number + "\nPrice : $" + number * 5 + "\nThank You!!!";
        return message;
    }
}