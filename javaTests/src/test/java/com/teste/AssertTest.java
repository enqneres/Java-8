package com.teste;

import org.junit.Test;

public class AssertTest {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        testAssertArrayEquals(esperado,atual);
    }
    private void testAssertArrayEquals(byte[] esperado, byte[] atual) {
    }

    @Test
    public void testAssertEquals(){
        testAssertEquals("text", "text");
    }

    private void testAssertEquals(String text, String text1) {
    }

    @Test
    public void testAssertFalse(){
        testAssertFalse(false);
    }

    private void testAssertFalse(boolean b) {
    }

    @Test
    public void testAssertNotNull(){
        testAssertNotNull(new Object());
    }

    private void testAssertNotNull(Object o) {
    }

    @Test
    public void testAssertNotSame(){
        testAssertNotSame(new Object(), new Object());
    }

    private void testAssertNotSame(Object o, Object o1) {
    }

    @Test
    public void testAssertNull(){
        testAssertNull(null);
    }

    private void testAssertNull(Object o) {
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(765);
        testAssertSame(aNumber,aNumber);
    }

    private void testAssertSame(Integer aNumber, Integer aNumber1) {
    }

}
