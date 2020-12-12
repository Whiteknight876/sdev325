
public boolean VerifyAdmin(String password) {
if (password.equals("Welcome1")) {
System.out.println("Entering Diagnostic Mode...");
return true;
}
System.out.println("Incorrect Password!");
return false;
}
