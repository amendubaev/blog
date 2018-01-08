class VacancyService
{

    getAllVacancyByCategoryId(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetCategoryById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var category = JSON.parse(request.responseText);
            return category.vacancy;
        }
        return null;
    }
    
    getAllVacancyByCompanyId(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetCompanyById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var company = JSON.parse(request.responseText);
            return company.vacancy;
        }
        return null;
    }

    getVacancyById(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetVacancyById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var vacancy = JSON.parse(request.responseText);
            return vacancy;
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


