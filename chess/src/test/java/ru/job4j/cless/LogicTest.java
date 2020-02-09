package ru.job4j.cless;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test
    public void testMoveBlackBishopForbidden() {
        BishopBlack figure1 = new BishopBlack(Cell.C1);
        BishopBlack figure2 = new BishopBlack(Cell.D2);
        Logic logic = new Logic();
        logic.add(figure1);
        logic.add(figure2);
        boolean result = logic.move(Cell.C1, Cell.G5);
        assertThat(result, is(false));
    }

    @Test
    public void testMoveBlackBishopAllowed() {
        BishopBlack figure1 = new BishopBlack(Cell.C1);
        BishopBlack figure2 = new BishopBlack(Cell.G5);
        Logic logic = new Logic();
        logic.add(figure1);
        logic.add(figure2);
        boolean result = logic.move(Cell.C1, Cell.D2);
        assertThat(result, is(true));
    }
}
