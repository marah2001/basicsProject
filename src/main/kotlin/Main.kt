var productCategories = arrayOf("foundation makeup","Dog beds","Bedding",
"Jewelry"," Grocery essentials","Skin care")
fun main(){
    displayArrayElements()
    addIntoArray("clothes")
    searchByCategoryName("foundation makeup")
    deleteCurrentElement("marah")
    updateElementValue("Dog beds","people beds")

}
//display all array elements
fun displayArrayElements(){
    for(c in productCategories.indices){
        println(productCategories[c])
    }
}
//add category into categories array
fun addIntoArray(category:String){
    for(c in productCategories.indices){
        productCategories.set(0,category)
    }

}
//search in array
fun searchByCategoryName(category:String) {
var statusOfCategory: String = "Not found!! 🥲"
    for(c in productCategories.indices){
        if(productCategories[c].equals(category)){
            statusOfCategory = "$category already in 👍"
            println(statusOfCategory)
            break
        }
    }
    statusOfCategory
    println(statusOfCategory)
}
//delete an element from array
fun deleteCurrentElement(category:String) {
    var statusOfCategory: String = "I can't see this element 😀"
    for(c in productCategories.indices){
        if (productCategories[c].equals(category)){
            statusOfCategory = "$category was deleted 🪄"
            println(statusOfCategory)
            break
        }
    }
    statusOfCategory
    println(statusOfCategory)

}
//update value in this array
fun updateElementValue(currentValue:String , newValue:String) {
    var elementStatus = "I can't see this element 😀"
    for(c in productCategories.indices){
        if(productCategories[c].equals(currentValue)){
            productCategories[c] ==  newValue
            elementStatus = "$currentValue is $newValue now🪄"
            println(elementStatus)
            break
        }
    }

    elementStatus
    println(elementStatus)
}
