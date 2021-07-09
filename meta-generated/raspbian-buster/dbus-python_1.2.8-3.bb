PACKAGES = "${PN} python-dbus python3-dbus"
PROVIDES = "python-dbus python3-dbus"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus-python/python-dbus_1.2.8-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus-python/python3-dbus_1.2.8-3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-dbus = "python-dbus_1.2.8-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "e79b78f1b43c7d40b2b6f27cf4c0df6d5417bc76591f810e0ff30c279915809a"
SRC_URI[deb0.md5sum] = "be03be39b6bb23c6cf34e9892b645404"
DEBFILENAME_python3-dbus = "python3-dbus_1.2.8-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "5026876fac2f75bd4dd70a33fe97063e8cb425a201ef710d214a8163029c72a6"
SRC_URI[deb1.md5sum] = "efbcd73456b22a6395ff3fa52e2fd344"

RDEPENDS_python-dbus = "libc6 (>= 2.4) libdbus-1-3 (>= 1.9.14) libglib2.0-0 (>= 2.40) python (<< 2.8) python (<< 2.8) python (>= 2.7~) python (>= 2.7~)"
RDEPENDS_python3-dbus = "libc6 (>= 2.4) libdbus-1-3 (>= 1.9.14) libglib2.0-0 (>= 2.40) python3 python3 (<< 3.8) python3 (>= 3.7~)"
DEPENDS = "libc6 libdbus-1-3 libglib2.0-0 python python3"


inherit deb_group

FILES_python-dbus = " \
    ./usr/lib/python2.7/dist-packages/_dbus_bindings.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/_dbus_glib_bindings.arm-linux-gnueabihf.so \
    ./usr/lib/python2.7/dist-packages/dbus/__init__.py \
    ./usr/lib/python2.7/dist-packages/dbus/_compat.py \
    ./usr/lib/python2.7/dist-packages/dbus/_dbus.py \
    ./usr/lib/python2.7/dist-packages/dbus/_expat_introspect_parser.py \
    ./usr/lib/python2.7/dist-packages/dbus/bus.py \
    ./usr/lib/python2.7/dist-packages/dbus/connection.py \
    ./usr/lib/python2.7/dist-packages/dbus/decorators.py \
    ./usr/lib/python2.7/dist-packages/dbus/exceptions.py \
    ./usr/lib/python2.7/dist-packages/dbus/gi_service.py \
    ./usr/lib/python2.7/dist-packages/dbus/glib.py \
    ./usr/lib/python2.7/dist-packages/dbus/gobject_service.py \
    ./usr/lib/python2.7/dist-packages/dbus/lowlevel.py \
    ./usr/lib/python2.7/dist-packages/dbus/mainloop/__init__.py \
    ./usr/lib/python2.7/dist-packages/dbus/mainloop/glib.py \
    ./usr/lib/python2.7/dist-packages/dbus/proxies.py \
    ./usr/lib/python2.7/dist-packages/dbus/server.py \
    ./usr/lib/python2.7/dist-packages/dbus/service.py \
    ./usr/lib/python2.7/dist-packages/dbus/types.py \
    ./usr/share/doc/python-dbus/NEWS.gz \
    ./usr/share/doc/python-dbus/README \
    ./usr/share/doc/python-dbus/changelog.Debian.gz \
    ./usr/share/doc/python-dbus/copyright \
    ./usr/share/lintian/overrides/python-dbus\
"
FILES_python3-dbus = " \
    ./usr/lib/python3/dist-packages/_dbus_bindings.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/_dbus_glib_bindings.cpython-37m-arm-linux-gnueabihf.so \
    ./usr/lib/python3/dist-packages/dbus/__init__.py \
    ./usr/lib/python3/dist-packages/dbus/_compat.py \
    ./usr/lib/python3/dist-packages/dbus/_dbus.py \
    ./usr/lib/python3/dist-packages/dbus/_expat_introspect_parser.py \
    ./usr/lib/python3/dist-packages/dbus/bus.py \
    ./usr/lib/python3/dist-packages/dbus/connection.py \
    ./usr/lib/python3/dist-packages/dbus/decorators.py \
    ./usr/lib/python3/dist-packages/dbus/exceptions.py \
    ./usr/lib/python3/dist-packages/dbus/gi_service.py \
    ./usr/lib/python3/dist-packages/dbus/glib.py \
    ./usr/lib/python3/dist-packages/dbus/lowlevel.py \
    ./usr/lib/python3/dist-packages/dbus/mainloop/__init__.py \
    ./usr/lib/python3/dist-packages/dbus/mainloop/glib.py \
    ./usr/lib/python3/dist-packages/dbus/proxies.py \
    ./usr/lib/python3/dist-packages/dbus/server.py \
    ./usr/lib/python3/dist-packages/dbus/service.py \
    ./usr/lib/python3/dist-packages/dbus/types.py \
    ./usr/share/doc/python3-dbus/NEWS.gz \
    ./usr/share/doc/python3-dbus/README \
    ./usr/share/doc/python3-dbus/changelog.Debian.gz \
    ./usr/share/doc/python3-dbus/copyright \
    ./usr/share/lintian/overrides/python3-dbus\
"
