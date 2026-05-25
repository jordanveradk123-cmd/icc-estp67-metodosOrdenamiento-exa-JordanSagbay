package controllers;

import models.Brand;

public class BrandController {
    public Brand[] sortSelectionAsc(Brand[] brands) {
        // Implementación del ordenamiento por selección ascendente
        int n = brands.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (brands[j].getTotalValidYears() < brands[minIndex].getTotalValidYears()) {
                    minIndex = j;
                }
            }
            // Intercambiar
            Brand temp = brands[minIndex];
            brands[minIndex] = brands[i];
            brands[i] = temp;
        }
        return brands;
    }
    public Brand binarySearchByValidYears(
    Brand[] brands, 
    int validYears,
    boolean isAscending
    ) {
        // Implementación de la búsqueda binaria por años de validez
        int left = 0;
        int right = brands.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (brands[mid].getTotalValidYears() == validYears) {
                return brands[mid];
            }

            if (isAscending) {
                if (brands[mid].getTotalValidYears() < validYears) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (brands[mid].getTotalValidYears() > validYears) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return null; // No encontrado
}

}


   

  