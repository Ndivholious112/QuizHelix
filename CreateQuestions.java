import java.util.ArrayList;
import java.util.List;

public class CreateQuestions {
    public static List<Question> createQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question("What is the capital of South Africa?", 'A',
                new String[]{"Pretoria", "Cape Town", "Johannesburg", "Durban"}));
        list.add(new Question("Which language is most spoken in South Africa?", 'B',
                new String[]{"Zulu", "Xhosa", "Afrikaans", "English"}));
        list.add(new Question("What year did South Africa become a democracy?", 'C',
                new String[]{"1990", "1992", "1994", "1996"}));
        list.add(new Question("Who was South Africa’s first black president?", 'A',
                new String[]{"Nelson Mandela", "Jacob Zuma", "Cyril Ramaphosa", "Thabo Mbeki"}));
        list.add(new Question("What is the national currency of South Africa?", 'B',
                new String[]{"Dollar", "Rand", "Euro", "Pound"}));
        list.add(new Question("Which ocean lies on South Africa’s west coast?", 'C',
                new String[]{"Indian Ocean", "Southern Ocean", "Atlantic Ocean", "Arctic Ocean"}));
        list.add(new Question("What is the name of the mountain overlooking Cape Town?", 'D',
                new String[]{"Drakensberg", "Lion's Head", "Devil’s Peak", "Table Mountain"}));
        list.add(new Question("Which province is Johannesburg in?", 'A',
                new String[]{"Gauteng", "Limpopo", "KwaZulu-Natal", "Mpumalanga"}));
        list.add(new Question("Which famous prison held Nelson Mandela?", 'C',
                new String[]{"Alcatraz", "Sun City", "Robben Island", "Pollsmoor"}));
        list.add(new Question("What sport is South Africa famous for?", 'D',
                new String[]{"Tennis", "Hockey", "Basketball", "Rugby"}));
        list.add(new Question("What is South Africa’s nickname?", 'A',
                new String[]{"Rainbow Nation", "Motherland", "Sunshine Land", "Southern Star"}));
        list.add(new Question("Which desert is partly in South Africa?", 'B',
                new String[]{"Sahara", "Kalahari", "Namib", "Atacama"}));
        list.add(new Question("What is the biggest dam in South Africa?", 'C',
                new String[]{"Sterkfontein", "Gariep", "Vaal", "Theewaterskloof"}));
        list.add(new Question("Which animal is NOT part of the Big Five?", 'D',
                new String[]{"Lion", "Elephant", "Rhino", "Giraffe"}));
        list.add(new Question("Which South African city is a legislative capital?", 'B',
                new String[]{"Bloemfontein", "Cape Town", "Pretoria", "Durban"}));

        return list;
    }
}
