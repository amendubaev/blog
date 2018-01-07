class VacancyController {
    constructor() {
        this.vacancyService = new VacancyService();
    }

    getAllVacancyByIdCategory(id) {
        return this.vacancyService.getAllVacancyByCategoryId(id);
    }

    getAllVacancyByIdCategoryView(id) {
        var vacancy = this.getAllVacancyByIdCategory(id);
        var element = document.getElementById("vacancy");
        var html = "";
        console.log(vacancy);
        for (var i = 0; i < vacancy.length; i++)
        {
//            var datepost = new Date(vacancy[i].date);
//            var options = {
//                year: 'numeric',
//                month: 'long',
//                day: 'numeric',
//                weekday: 'long',
//                hour: 'numeric',
//                minute: 'numeric'
//            };
//            datepost = datepost.toLocaleString("ru", options);

            html += "<div class='jumbotron' onclick='vacancyClicked(" + vacancy[i].id + ")' >" +
                    "<h1> " + vacancy[i].name + "</h1>" +
                    "</div>";
        }
        element.innerHTML = html;
    }

    getVacancyById(id) {
        return this.vacancyService.getVacancyById(id);
    }

    getVacancyByIdView(id) {
        var vacancy = this.getVacancyById(id);
        var element = document.getElementById("vacancy");
        var html = "";


        html += "<div class='jumbotron' onclick='vacancyClicked(" + vacancy.id + ")' >" +
                "</div>";

        element.innerHTML = html;
    }

}


