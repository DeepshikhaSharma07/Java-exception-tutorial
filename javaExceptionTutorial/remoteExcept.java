package com.tts.day5.javaExceptionTutorial;

import java.rmi.RemoteException;

public class remoteExcept {

    public void deposit(double amount) throws RemoteException {
        // Method implementation
        throw new RemoteException();
    }
    // Remainder of class definition

    public void withdraw(double amount) throws RemoteException,
            InsufficientFundsException {
        // Method implementation
    }
    // Remainder of class definition


}
