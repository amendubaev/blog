class CompanyController
{
    constructor() {
        this.companyService = new CompanyService();
    }

    getAllCompany() {
        return this.companyService.getAllCompany();
    }

    getAllCompanyViewListGroup() {
        var list = this.getAllCompany();
        var element = document.getElementById("company");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<a onclick ='companyClicked(" + list[i].id + ")' class='list-group-item'>" + list[i].name + "</a>";
        }
        element.innerHTML = html;
        console.log(list.length);
        return list.length;
    }

    getCompanyById(id) {
        return this.companyService.getCompanyById(id);
    }

    getAllCompanyViewListButton() {
        var list = this.getAllCompany();
        var element = document.getElementById("company");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<div onclick ='companyClicked(" + list[i].id + ")' \n\
                    class='btn btn-success'>" + list[i].name + "</div>";
        }
        element.innerHTML = html;
    }

}


