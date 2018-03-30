PACKAGES = "${PN} python-dbus python-dbus-dev"
PROVIDES = "python-dbus python-dbus-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/dbus-python/python-dbus_1.2.0-2+b3_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/d/dbus-python/python-dbus-dev_1.2.0-2_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_python-dbus = "python-dbus_1.2.0-2+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "48b91c5fc81a898028402405b3605e02153506773fddd7fbf7986d9d845ba283"
SRC_URI[deb0.md5sum] = "926da0058866e1f70ad1864f7c50abb4"
DEBFILENAME_python-dbus-dev = "python-dbus-dev_1.2.0-2_all.deb"
SRC_URI[deb1.sha256sum] = "b0e2a7c5d4dcb5cca78ad7b9cc358c4bda01a4ee9646cb441d2a2aca56eef8e6"
SRC_URI[deb1.md5sum] = "ce7b6ee8d5644139880c2126bca52ced"

RDEPENDS_python-dbus = "python (>= 2.7) python (<< 2.8) libc6 (>= 2.4) libdbus-1-3 (>= 1.5.12) libdbus-glib-1-2 (>= 0.78) libglib2.0-0 (>= 2.12.0) python-dbus-dev"
DEPENDS = "python libc6 libdbus-glib-1-2 libglib2.0-0 libdbus-1-3"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_python-dbus = " \
    ./usr/lib/python2.7/dist-packages/_dbus_bindings.so \
    ./usr/lib/python2.7/dist-packages/_dbus_glib_bindings.so \
    ./usr/lib/python2.7/dist-packages/dbus/__init__.py \
    ./usr/lib/python2.7/dist-packages/dbus/_compat.py \
    ./usr/lib/python2.7/dist-packages/dbus/_dbus.py \
    ./usr/lib/python2.7/dist-packages/dbus/_expat_introspect_parser.py \
    ./usr/lib/python2.7/dist-packages/dbus/_version.py \
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
    ./usr/share/doc/python-dbus/changelog.Debian.armhf.gz \
    ./usr/share/doc/python-dbus/changelog.Debian.gz \
    ./usr/share/doc/python-dbus/changelog.gz \
    ./usr/share/doc/python-dbus/copyright\
"
FILES_python-dbus-dev = " \
    ./usr/include/dbus-1.0/dbus/dbus-python.h \
    ./usr/lib/pkgconfig/dbus-python.pc \
    ./usr/share/doc/python-dbus-dev/changelog.Debian.gz \
    ./usr/share/doc/python-dbus-dev/changelog.gz \
    ./usr/share/doc/python-dbus-dev/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
