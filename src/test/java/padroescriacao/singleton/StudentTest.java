package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void retornaNomeAluno(){
        Student.getInstance().setNameStudent("Gabriel Bronte Cardoso");
        assertEquals("Gabriel Bronte Cardoso", Student.getInstance().getNameStudent());
    }

    @Test
    void retornaMatriculaAluno(){
        Student.getInstance().setNameStudent("201835002");
        assertEquals("201835002", Student.getInstance().getNameStudent());
    }
}