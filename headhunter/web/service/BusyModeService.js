class BusyModeService {

    getAllBusyMode() {
        var request = new XMLHttpRequest();
        request.open('GET', '/headhunter/GetAllBusyMode', false);
        request.send();
        if (request.status === 200)
        {
            var listBusyMode = JSON.parse(request.responseText);
            return listBusyMode;
        }
        return null;
    }
}