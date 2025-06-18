 Feature: Billing
 Scenario Outline: Verify order is placed sucessfully or not
  When user selects billing address and clicks continue button
  Then user selects shipping address and clicks continue button
  Then user selects shipping method and clicks continue button
  Then user payment method and clicks continue button
  Then payment information will be displayed and user click continue button
  Then user verify product details and clicks confirm button
  Then order placed successfully message will be displayed and order id will be displayed