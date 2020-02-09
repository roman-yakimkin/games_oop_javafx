package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void diagonalTest1() {
        Cell source = Cell.findBy(1, 2);
        Cell dest = Cell.findBy(6, 7);
        BishopBlack figure = new BishopBlack(source);
        boolean isDiagonal = figure.isDiagonal(source, dest);
        assertThat(isDiagonal, is(true));
    }

    @Test
    public void diagonalTest2() {
        Cell source = Cell.findBy(1, 2);
        Cell dest = Cell.findBy(3, 6);
        BishopBlack figure = new BishopBlack(source);
        boolean isDiagonal = figure.isDiagonal(source, dest);
        assertThat(isDiagonal, is(false));
    }

    @Test
    public void positionTest() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        Cell position = figure.position();
        assertThat(position, is(Cell.C1));
    }

    @Test
    public void copyTest() {
        Figure figure = new BishopBlack(Cell.C1);
        Figure copied = figure.copy(Cell.G5);
        assertThat(copied.position(), is(Cell.G5));
    }

    @Test
    public void wayTest() {
        Cell source = Cell.C1;
        Cell desc = Cell.G5;
        BishopBlack figure = new BishopBlack(source);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] result = figure.way(source, desc);
        assertThat(result, is(expected));
    }
}
