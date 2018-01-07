class CategoryService {

    getAllCategory() {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetAllCategory', false);
        request.send();
        if (request.status === 200)
        {
            var listCategory = JSON.parse(request.responseText);
            return listCategory;
        }
        return null;
    }

    getCategoryById(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetCategoryById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var category = JSON.parse(request.responseText);
            return category;
        }
        return null;
    }

    insertCategory() {

    }

    updateCategory() {

    }

    deleteCategory() {

    }
}