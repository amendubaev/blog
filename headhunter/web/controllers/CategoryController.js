class CategoryController
{
    constructor() {
        this.categoryService = new CategoryService();
    }

    getAllCategory() {
        return this.categoryService.getAllCategory();
    }

    getAllCategoryViewListGroup() {
        var list = this.getAllCategory();
        var element = document.getElementById("category");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<a onclick ='categoryClicked(" + list[i].id + ")' class='list-group-item'>" + list[i].name + "</a>";
        }
        element.innerHTML = html;
        console.log(lists.length);
        return list.length;
    }
    getAllCategoryViewListGroupListBox() {
        var list = this.getAllCategory();
        var element = document.getElementById("categoryList");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<option id='InputVacancyCategory' value='" + list[i].id + "'>" + list[i].name + "</option>";
        }
        element.innerHTML = html;
        console.log(list.length);
        return list.length;
    }
    getCategoryById(id) {
        return this.categoryService.getCategoryById(id);
    }

    getAllCategoryViewListButton() {
        var list = this.getAllCategory();
        var element = document.getElementById("category");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<div onclick ='categoryClicked(" + list[i].id + ")' \n\
                    class='btn btn-success'>" + list[i].name + "</div>";
        }
        element.innerHTML = html;
    }

}


