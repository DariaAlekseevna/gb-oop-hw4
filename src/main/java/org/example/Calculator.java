package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Calculator {

    /**
     * @param list список из цифр
     * @return сложение всех элементов в списке
     */
    public Double sum(List<? extends Number> list) {
        Double sum = 0.0;
        for (Number elem : list) {
            sum += elem.doubleValue();
        }
        return sum;
    }

    /**
     * @param list список цифр
     * @return перемножение всех элементов в списке
     */
    public Double multiply(List<? extends Number> list) {
        Double multi = 1.0;
        for (Number elem : list) {
            multi *= elem.doubleValue();
        }
        return multi;
    }

    /**
     * @param list список из цифр
     * @return деление первого элемента поочередно на все элементы в списке
     */
    public Double division(List<? extends Number> list) {
        Double div = list.get(0).doubleValue();
        for (Number elem : list) {
            if (elem.doubleValue() != 0.0) {
                div /= elem.doubleValue();
            } else {
                System.out.println("на ноль делить нельзя");
                return null;
            }
        }
        return div;
    }

    /**
     * @param list список с любыми значениями
     * @return список преобразованный в формат Integer или сообщение об ошибке и null
     */
    public List<Integer> listConversionToTheRequiredFormat(List<?> list) {
        List<Integer> formatList = new ArrayList<>();
        List<String> transitList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String) {
                if (((String) list.get(i)).length() > 2 &&
                        ((String) list.get(i)).substring(((String) list.get(i)).length() - 2).equals(".0")) {
                    transitList.add(((String) list.get(i)).replace(".0", ""));
                    formatList.add(Integer.parseInt(transitList.get(i)));
                } else {
                    try {
                        formatList.add(Integer.parseInt((String) list.get(i)));
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                        System.out.println("программа не позволяет преобразовать строку данного типа в числовой вид," +
                                " подходящий для дальнейшего преобразования в бинарный вид!!");
                        return null;
                    }
                }
            } else if (list.get(i) instanceof Number) {
                try {
                    formatList.add(((Number) list.get(i)).intValue());
                } catch (NumberFormatException e) {
                    System.out.println(e);
                    System.out.println("программа не позволяет получить тип Integer," +
                            " подходящий для дальнейшего преобразования в бинарный вид!!");
                }
            }

        }
        return formatList;
    }

    /**
     * @param list список c любыми значениями
     * @return список, значения которого преобразованы в бинарный формат или сообщение об ошибке и null
     */
    public List<String> conversionToBinary(List<?> list) {
        List<String> binList = new ArrayList<>();
        if (listConversionToTheRequiredFormat(list) != null) {
            for (Integer elem : listConversionToTheRequiredFormat(list)) {
                binList.add(Integer.toBinaryString(elem.intValue()));
            }
            return binList;
        } else {
            System.out.println("программа не содержит функционал для конвертации введенных данных.");
            return null;
        }
    }

}
