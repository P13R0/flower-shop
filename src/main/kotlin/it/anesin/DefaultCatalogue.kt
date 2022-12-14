package it.anesin

import it.anesin.FlowerType.*

class DefaultCatalogue: Catalogue {

  override fun bundlesOf(type: FlowerType): List<Bundle> {
    return when (type) {
      R12 -> listOf(Bundle(5, 6.99, type), Bundle(10, 12.99, type))
      L09 -> listOf(Bundle(3, 9.95, type), Bundle(6, 16.95, type), Bundle(9, 24.95, type))
      T58 -> listOf(Bundle(3, 5.95, type), Bundle(5, 9.95, type), Bundle(9, 16.99, type))
    }
  }
}
