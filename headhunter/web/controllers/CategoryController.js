class CategoryController
{
    constructor()
    {
        this.categoryService  = new CategoryService();
    }
    
    getAllCategory()
    {
        return this.categoryService.getAllCategory();
    }
    getAllCategoryViewListGroup()
    {
        var list =  this.getAllCategory();
        var element = document.getElementById("category");
        var html ="";
        for(var i=0;i<list.length;i++)
        {
            html +="<a onclick ='categoryClicked("+list[i].id+")' class='list-group-item'>" + list[i].name + "</a>";
        }
        element.innerHTML = html;
    }
    
    getCategoryById(id)
    {
        return this.categoryService.getCategoryById(id);
    }
    
    getAllCategoryViewListButton()
    {
        var list =  this.getAllCategory();
        var element = document.getElementById("category");
        var html ="";
        for(var i=0;i<list.length;i++)
        {
            html +="<div onclick ='categoryClicked("+list[i].id+")' \n\
                    class='btn btn-success'>" + list[i].name + "</div>";
        }
        element.innerHTML = html;
    }
  
}


