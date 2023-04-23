package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Calculator {
    /**
     * @param list список из цифр
     * @return сложение всех элементов в списке
     */
    public Double sum(List<? extends Number> list){
        Double sum =0.0;
        for (Number elem: list) {
            sum+= elem.doubleValue();
        }
        return sum;
    };


    /**
     * @param list список цифр
     * @return перемножение всех элементов в списке
     */
    public Double multiply(List<? extends Number> list){
        Double multi = 1.0;
        for (Number elem: list) {
            multi *= elem.doubleValue();
        }
        return multi;
    }

    /**
     * @param list список из цифр
     * @return деление первого элемента поочередно на все элементы в списке
     */
    public Double division(List<? extends Number> list){
        Double div = list.get(0).doubleValue();
        for (Number elem: list) {
            if (elem.doubleValue() != 0.0) {
                div /= elem.doubleValue();
            } else {
                System.out.println("на ноль делить нельзя");
                return null;
            }
        }
        return div;
    }

    public Double conversionToBinary(List<? extends Number> list){
        return null;
    }

}
