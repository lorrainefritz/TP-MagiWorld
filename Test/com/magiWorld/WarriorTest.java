package com.magiWorld;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {



    @Test
    public void givenWarriorDescpritionWhenChooseClassThenDisplayWarriorSentence() { // magnifique test qui ne marche pas DUTOUT
       Warrior warrior1 = new Warrior(1, 1, 0, 0);
        assertEquals("Woarg moi grand guerrier élu de Crom : où moi taper?\n Je suis le Joueur 1, je suis niveau 1, je possède 0 de vitalité, 1 de force, 0 d'agilité et 0 d'intelligence +  \n",
                warrior1.toString());
    }

    @Test
    void basicAttack() {
    }

    @Test
    void specialAttack() {
    }


}