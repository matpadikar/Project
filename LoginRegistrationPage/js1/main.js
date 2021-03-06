$(document).ready(function(e) {

  var html = '<div class="row_group">' +
    '<div class="col-md-4">' +
    '<div class="form-group">' +
    '<label>Food Name</label>' +
    '<input type="text" name="food_name[]" class = "form-control">' +
    '</div>' +
    '</div>' +
    '<div class="col-md-2">' +
    '<div class="form-group">' +
    '<label>State</label>' +
    '<select name = "food_state[]" class = "form-control">' +
    '<option selection disabled>Please select..</option>' +
    '<option value="liquid">Liquid</option>' +
    '<option value="solid">Solid</option>' +
    '</select>' +
    '</div>' +
    '</div>' +
    '<div class="col-md-2">' +
    '<div class="form-group">' +
    '<label>Package</label>' +
    '<select name = "food_pack[]" class = "form-control">' +
    '<option selection disabled>Please select..</option>' +
    '<option value="yes">Yes</option>' +
    '<option value="no">No</option>' +
    '</select>' +
    '</div>' +
    '</div>' +
    '<div class="col-md-2">' +
    '<div class="form-group">' +
    '<label>Shelf Life</label>' +
    '<select name = "food_life[]" class = "form-control">' +
    '<option selection disabled>Please select..</option>' +
    '<option value="<6">Less than 6hrs</option>' +
    '<option value="<12">Less than 12hrs</option>' +
    '<option value="<18">Less than 18hrs</option>' +
    '<option value="<24">Less than 24hrs</option>' +
    '</select>' +
    '</div>' +
    '</div>' +
    '<div class="col-md-2">' +
    '<div class="form-group">' +
    '<button type="button" id = "btnRemove" class = "btn btn-danger btnRemove">Remove</button>' +
    '</div>' +
    '</div>' +
    '</div>';
var maxRows = 4;
var x = 1;
  $("#btnAdd").click(function(e) {

    if(x <= maxRows){
    $(".form_content").append(html);
    x++;
  }
  });
  $(".form_content").on('click', "#btnRemove", function(e) {
    $(this).closest(".row_group").remove();
    x--;
  });

  $("#insert_form").on('click', "#submit", function(e){

    var form_data = $("#insert_form").serialize();
    document.write(form_data);
    console.log(form_data);
    $.ajax({
      url:"",
      method: "POST",
      data: JSON.stringify(form_data),
      success:function(data)
      {
        alert(data);
      }
      //console.log(data),
    });
  });


});
