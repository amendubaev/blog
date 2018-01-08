class CompanyService {

    getAllCompany() {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetAllCompany', false);
        request.send();
        if (request.status === 200)
        {
            var listCompany = JSON.parse(request.responseText);
            return listCompany;
        }
        return null;
    }

    getCompanyById(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetCompanyById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var company = JSON.parse(request.responseText);
            return company;
        }
        return null;
    }

    insertCompany() {

    }

    updateCompany() {

    }

    deleteCompany() {

    }
}