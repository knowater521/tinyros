(function(f){if(typeof exports==="object"&&typeof module!=="undefined"){module.exports=f();}else if(typeof define==="function"&&define.amd){define([],f);}else{var g;if(typeof window!=="undefined"){g=window;}else if(typeof global!=="undefined"){g=global;}else if(typeof self!=="undefined"){g=self;}else{g=this;}if(typeof g.geometry_msgs==="undefined"){g.geometry_msgs={};}g.geometry_msgs.Quaternion=f();}})(function(){var define,module,exports;'use strict';

function Quaternion() {
    this.x = 0.0;
    this.y = 0.0;
    this.z = 0.0;
    this.w = 0.0;
};

Quaternion.prototype.serialize = function(buff, idx) {
    var offset = idx;
    var float64Array_x = new Float64Array(1);
    var uInt8Float64Array_x = new Uint8Array(float64Array_x.buffer);
    float64Array_x[0] = +this.x;
    buff[offset + 0] = uInt8Float64Array_x[0];
    buff[offset + 1] = uInt8Float64Array_x[1];
    buff[offset + 2] = uInt8Float64Array_x[2];
    buff[offset + 3] = uInt8Float64Array_x[3];
    buff[offset + 4] = uInt8Float64Array_x[4];
    buff[offset + 5] = uInt8Float64Array_x[5];
    buff[offset + 6] = uInt8Float64Array_x[6];
    buff[offset + 7] = uInt8Float64Array_x[7];
    offset += 8;
    var float64Array_y = new Float64Array(1);
    var uInt8Float64Array_y = new Uint8Array(float64Array_y.buffer);
    float64Array_y[0] = +this.y;
    buff[offset + 0] = uInt8Float64Array_y[0];
    buff[offset + 1] = uInt8Float64Array_y[1];
    buff[offset + 2] = uInt8Float64Array_y[2];
    buff[offset + 3] = uInt8Float64Array_y[3];
    buff[offset + 4] = uInt8Float64Array_y[4];
    buff[offset + 5] = uInt8Float64Array_y[5];
    buff[offset + 6] = uInt8Float64Array_y[6];
    buff[offset + 7] = uInt8Float64Array_y[7];
    offset += 8;
    var float64Array_z = new Float64Array(1);
    var uInt8Float64Array_z = new Uint8Array(float64Array_z.buffer);
    float64Array_z[0] = +this.z;
    buff[offset + 0] = uInt8Float64Array_z[0];
    buff[offset + 1] = uInt8Float64Array_z[1];
    buff[offset + 2] = uInt8Float64Array_z[2];
    buff[offset + 3] = uInt8Float64Array_z[3];
    buff[offset + 4] = uInt8Float64Array_z[4];
    buff[offset + 5] = uInt8Float64Array_z[5];
    buff[offset + 6] = uInt8Float64Array_z[6];
    buff[offset + 7] = uInt8Float64Array_z[7];
    offset += 8;
    var float64Array_w = new Float64Array(1);
    var uInt8Float64Array_w = new Uint8Array(float64Array_w.buffer);
    float64Array_w[0] = +this.w;
    buff[offset + 0] = uInt8Float64Array_w[0];
    buff[offset + 1] = uInt8Float64Array_w[1];
    buff[offset + 2] = uInt8Float64Array_w[2];
    buff[offset + 3] = uInt8Float64Array_w[3];
    buff[offset + 4] = uInt8Float64Array_w[4];
    buff[offset + 5] = uInt8Float64Array_w[5];
    buff[offset + 6] = uInt8Float64Array_w[6];
    buff[offset + 7] = uInt8Float64Array_w[7];
    offset += 8;
    return offset;
};

Quaternion.prototype.deserialize = function(buff, idx) {
    var offset = idx;
    var float64Array_x = new Float64Array(1);
    var uInt8Float64Array_x = new Uint8Array(float64Array_x.buffer);
    uInt8Float64Array_x[0] = buff[offset + 0];
    uInt8Float64Array_x[1] = buff[offset + 1];
    uInt8Float64Array_x[2] = buff[offset + 2];
    uInt8Float64Array_x[3] = buff[offset + 3];
    uInt8Float64Array_x[4] = buff[offset + 4];
    uInt8Float64Array_x[5] = buff[offset + 5];
    uInt8Float64Array_x[6] = buff[offset + 6];
    uInt8Float64Array_x[7] = buff[offset + 7];
    this.x = float64Array_x[0];
    offset += 8;
    var float64Array_y = new Float64Array(1);
    var uInt8Float64Array_y = new Uint8Array(float64Array_y.buffer);
    uInt8Float64Array_y[0] = buff[offset + 0];
    uInt8Float64Array_y[1] = buff[offset + 1];
    uInt8Float64Array_y[2] = buff[offset + 2];
    uInt8Float64Array_y[3] = buff[offset + 3];
    uInt8Float64Array_y[4] = buff[offset + 4];
    uInt8Float64Array_y[5] = buff[offset + 5];
    uInt8Float64Array_y[6] = buff[offset + 6];
    uInt8Float64Array_y[7] = buff[offset + 7];
    this.y = float64Array_y[0];
    offset += 8;
    var float64Array_z = new Float64Array(1);
    var uInt8Float64Array_z = new Uint8Array(float64Array_z.buffer);
    uInt8Float64Array_z[0] = buff[offset + 0];
    uInt8Float64Array_z[1] = buff[offset + 1];
    uInt8Float64Array_z[2] = buff[offset + 2];
    uInt8Float64Array_z[3] = buff[offset + 3];
    uInt8Float64Array_z[4] = buff[offset + 4];
    uInt8Float64Array_z[5] = buff[offset + 5];
    uInt8Float64Array_z[6] = buff[offset + 6];
    uInt8Float64Array_z[7] = buff[offset + 7];
    this.z = float64Array_z[0];
    offset += 8;
    var float64Array_w = new Float64Array(1);
    var uInt8Float64Array_w = new Uint8Array(float64Array_w.buffer);
    uInt8Float64Array_w[0] = buff[offset + 0];
    uInt8Float64Array_w[1] = buff[offset + 1];
    uInt8Float64Array_w[2] = buff[offset + 2];
    uInt8Float64Array_w[3] = buff[offset + 3];
    uInt8Float64Array_w[4] = buff[offset + 4];
    uInt8Float64Array_w[5] = buff[offset + 5];
    uInt8Float64Array_w[6] = buff[offset + 6];
    uInt8Float64Array_w[7] = buff[offset + 7];
    this.w = float64Array_w[0];
    offset += 8;
    return offset;
};

Quaternion.prototype.serializedLength = function() {
    var length = 0;
    length += 8
    length += 8
    length += 8
    length += 8
    return length;
};

Quaternion.prototype.echo = function() { return ""; };

Quaternion.prototype.getType = function() { return "geometry_msgs/Quaternion"; };

Quaternion.prototype.getMD5 = function() { return "175c1571887d10ebed42ba6c042ddd88"; };

Quaternion.prototype.getID = function() { return 0; };

Quaternion.prototype.setID = function(id) { };

return function() { return new Quaternion(); };

});
