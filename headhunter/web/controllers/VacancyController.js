class VacancyController {

    constructor() {
        this.vacancyService = new VacancyService();
    }

    getAllVacancyByIdCategory(id) {
        return this.vacancyService.getAllVacancyByCategoryId(id);
    }
    
    getAllVacancyByIdCompany(id) {
        return this.vacancyService.getAllVacancyByCompanyId(id);
    }

    getAllVacancyByIdCategoryView(id, oneTime) {
        var vacancy = this.getAllVacancyByIdCategory(id);
        var element = document.getElementById("vacancy");
        var html = "";
        console.log(vacancy);
        for (var i = 0; i < vacancy.length; i++) {
            var datepost = new Date(vacancy[i].date);
            var options = {
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                weekday: 'long',
                hour: 'numeric',
                minute: 'numeric'
            };
            datepost = datepost.toLocaleString("ru", options);

            var imageText = "";
            if (vacancy[i].company.logo.length > 0) {
                imageText += "<img  class='img-responsive' src='data:image/png;base64," + vacancy[i].company.logo + "'>";
            } else {
                imageText += " <img class='img-responsive' data-src='holder.js/300x200'  src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iMjAwIj48cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0iI2VlZSIvPjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjE1MCIgeT0iMTAwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjE5cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MzAweDIwMDwvdGV4dD48L3N2Zz4=' >";
            }


            html += "<div class='jumbotron' onclick='vacancyClicked(" + vacancy[i].id + ")' >" +
                    imageText +
                    "<h2> " + vacancy[i].name + "</h2>" +
                    "<hp> " + vacancy[i].description + "</p>" +
                    "<b>Заработная плата: </b>" + vacancy[i].salary + " руб. <br>" +
                    "<b>Опыт работы: </b>" + vacancy[i].experience + "<br>" +
                    "<b>Адрес: </b>" + vacancy[i].location + "<br>" +
                    "<b>Режим занятости: </b>" + vacancy[i].busymode.name + "<br>" +
                    "<b>Компания: </b>" + vacancy[i].company.name + "<br>" +
                    "<b>Категория: </b>" + vacancy[i].category.name + "<br>" +
                    "<p align='right'>" + datepost + "</p>" +
                    "</div>";
        }
        if (oneTime)
            element.innerHTML = "";
        element.innerHTML += html;
    }
    
    getAllVacancyByIdCategoryView(id, oneTime) {
        var vacancy = this.getAllVacancyByIdCategory(id);
        var element = document.getElementById("vacancy");
        var html = "";
        console.log(vacancy);
        for (var i = 0; i < vacancy.length; i++) {
            var datepost = new Date(vacancy[i].date);
            var options = {
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                weekday: 'long',
                hour: 'numeric',
                minute: 'numeric'
            };
            datepost = datepost.toLocaleString("ru", options);

            var imageText = "";
            if (vacancy[i].company.logo.length > 0) {
                imageText += "<img  class='img-responsive' src='data:image/png;base64," + vacancy[i].company.logo + "'>";
            } else {
                imageText += " <img class='img-responsive' data-src='holder.js/300x200'  src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iMjAwIj48cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0iI2VlZSIvPjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjE1MCIgeT0iMTAwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjE5cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MzAweDIwMDwvdGV4dD48L3N2Zz4=' >";
            }


            html += "<div class='jumbotron' onclick='vacancyClicked(" + vacancy[i].id + ")' >" +
                    imageText +
                    "<h2> " + vacancy[i].name + "</h2>" +
                    "<hp> " + vacancy[i].description + "</p>" +
                    "<b>Заработная плата: </b>" + vacancy[i].salary + " руб. <br>" +
                    "<b>Опыт работы: </b>" + vacancy[i].experience + "<br>" +
                    "<b>Адрес: </b>" + vacancy[i].location + "<br>" +
                    "<b>Режим занятости: </b>" + vacancy[i].busymode.name + "<br>" +
                    "<b>Компания: </b>" + vacancy[i].company.name + "<br>" +
                    "<b>Категория: </b>" + vacancy[i].category.name + "<br>" +
                    "<p align='right'>" + datepost + "</p>" +
                    "</div>";
        }
        if (oneTime)
            element.innerHTML = "";
        element.innerHTML += html;
    }
    
    getAllVacancyByIdCompanyView(id, oneTime) {
        var vacancy = this.getAllVacancyByIdCompany(id);
        var element = document.getElementById("vacancy");
        var html = "";
        console.log(vacancy);
        for (var i = 0; i < vacancy.length; i++) {
            var datepost = new Date(vacancy[i].date);
            var options = {
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                weekday: 'long',
                hour: 'numeric',
                minute: 'numeric'
            };
            datepost = datepost.toLocaleString("ru", options);

            var imageText = "";
            if (vacancy[i].company.logo.length > 0) {
                imageText += "<img  class='img-responsive' src='data:image/png;base64," + vacancy[i].company.logo + "'>";
            } else {
                imageText += " <img class='img-responsive' data-src='holder.js/300x200'  src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iMjAwIj48cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0iI2VlZSIvPjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjE1MCIgeT0iMTAwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjE5cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MzAweDIwMDwvdGV4dD48L3N2Zz4=' >";
            }


            html += "<div class='jumbotron' onclick='vacancyClicked(" + vacancy[i].id + ")' >" +
                    imageText +
                    "<h2> " + vacancy[i].name + "</h2>" +
                    "<hp> " + vacancy[i].description + "</p>" +
                    "<b>Заработная плата: </b>" + vacancy[i].salary + " руб. <br>" +
                    "<b>Опыт работы: </b>" + vacancy[i].experience + "<br>" +
                    "<b>Адрес: </b>" + vacancy[i].location + "<br>" +
                    "<b>Режим занятости: </b>" + vacancy[i].busymode.name + "<br>" +
                    "<b>Компания: </b>" + vacancy[i].company.name + "<br>" +
                    "<b>Категория: </b>" + vacancy[i].category.name + "<br>" +
                    "<p align='right'>" + datepost + "</p>" +
                    "</div>";
        }
        if (oneTime)
            element.innerHTML = "";
        element.innerHTML += html;
    }

    getVacancyById(id) {
        return this.vacancyService.getVacancyById(id);
    }

    getVacancyByIdView(id) {
        var vacancy = this.getVacancyById(id);
        var element = document.getElementById("vacancy");
        var html = "";
        var datepost = new Date(vacancy.date);
        var options = {
            year: 'numeric',
            month: 'long',
            day: 'numeric',
            weekday: 'long',
            hour: 'numeric',
            minute: 'numeric'
            };
        datepost = datepost.toLocaleString("ru", options);

        var imageText = "";
        if (vacancy.company.logo.length > 0) {
            imageText += "<img  class='img-responsive' src='data:image/png;base64," + vacancy.company.logo + "'>";
        } else {
            imageText += " <img class='img-responsive' data-src='holder.js/300x200'  src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iMjAwIj48cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0iI2VlZSIvPjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjE1MCIgeT0iMTAwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjE5cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MzAweDIwMDwvdGV4dD48L3N2Zz4=' >";
        }
        html += "<div class='jumbotron'>" +
        imageText +
        "<h2> " + vacancy.name + "</h2>" +
        "<hp> " + vacancy.description + "</p>" +
        "<b>Заработная плата: </b>" + vacancy.salary + " руб. <br>" +
        "<b>Опыт работы: </b>" + vacancy.experience + "<br>" +
        "<b>Адрес: </b>" + vacancy.location + "<br>" +
        "<b>Режим занятости: </b>" + vacancy.busymode.name + "<br>" +
        "<b>Компания: </b>" + vacancy.company.name + "<br>" +
        vacancy.company.description + "<br>" +
        "<b>Категория: </b>" + vacancy.category.name + "<br>" +
        "<b>Телефон: </b>" + vacancy.company.phone + "<br>" +
        "<p align='right'>" + datepost + "</p>" +
        "</div>";
        element.innerHTML = html;
    }
    
    getShortVacancyByIdView(id) {
        var vacancy = this.getVacancyById(id);      
        
        $("#InputVacancy").val(vacancy.name);
        $("#InputVacancyDescription").val(vacancy.description);
        $("#InputVacancySalary").val(vacancy.salary);
        $("#InputVacancyExperience").val(vacancy.experience);
        $("#InputVacancyLocation").val(vacancy.location);
        $("#busyModeList").val(vacancy.busymode.id);
        $("#companyList").val(vacancy.company.id);
        $("#categoryList").val(vacancy.category.id);
    }

}


