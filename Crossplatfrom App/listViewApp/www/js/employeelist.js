var serviceURL = "http://localhost/directory/services/";

var employees;

$('#employeeListPage').bind('pageinit', function(event) {
	getEmployeeList();
});

function getEmployeeList() {
    $('#employeeList li').remove();
    employees =
        [{
              picture:"ico_person_unknown.png",
              story:"Brunch this weekend?",
              firstName:"Ali",
              lastName:"Connors",
              status:"I will  be in your neighborhood..."
        },
        {
         picture:"ico_person_unknown.png",
         story:"Brunch this weekend?",
         firstName:"Ali",
         lastName:"Connors",
         status:"I will  be in your neighborhood..."
        },
        {
         picture:"ico_person_unknown.png",
         story:"Brunch this weekend?",
         firstName:"Ali",
         lastName:"Connors",
         status:"I will  be in your neighborhood..."
         }
         ];
    
    $.each(employees, function(index, employee) {
        $('#employeeList').append('<li>' +
                '<img class="img-circle" src="pics/' + employee.picture + '"/>' +
                '<h4>' +employee.story+ '</h4>' +
                '<p style="margin:0;display:inline;float:left ; font-weight: bold;">' + employee.firstName + ' ' + employee.lastName +' </p><p style="margin:0;display:inline;float:left">-- '+ employee.status + '</p>' +
                '</li>');
    });
    $('#employeeList').listview('refresh');
}
