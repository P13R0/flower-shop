package it.anesin

interface Catalogue {
  fun bundlesOf(type: FlowerType): List<Bundle>
}
