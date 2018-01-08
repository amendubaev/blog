class BusyModeController
{
    constructor() {
        this.busyModeService = new BusyModeService();
    }

    getAllBusyMode() {
        return this.busyModeService.getAllBusyMode();
    }

    getAllBusyModeListBox() {
        var list = this.getAllBusyMode();
        var element = document.getElementById("busyModeList");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<option id='InputVacancyBusyMode' value='" + list[i].id + "'>" + list[i].name + "</option>";
        }
        element.innerHTML = html;
        return list.length;
    }
}