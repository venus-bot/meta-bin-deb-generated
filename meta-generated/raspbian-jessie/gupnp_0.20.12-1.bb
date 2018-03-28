PACKAGES = "${PN} gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
PROVIDES = "gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/gir1.2-gupnp-1.0_0.20.12-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-4_0.20.12-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-dev_0.20.12-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gupnp-1.0 = "gir1.2-gupnp-1.0_0.20.12-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "909e087eb8902847c6f62ecd6413f79905253824e13ec7ef6f8bbdba465d28a3"
SRC_URI[deb0.md5sum] = "9c6dbf36ee6c52232d31fec8deffc7de"
DEBFILENAME_libgupnp-1.0-4 = "libgupnp-1.0-4_0.20.12-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "fdf5e007a6bc62041330ba860caf76ce82aa95eccf7fab4a57f08e2b839bcbf3"
SRC_URI[deb1.md5sum] = "dbbe2a773226233c488a508182a67359"
DEBFILENAME_libgupnp-1.0-dev = "libgupnp-1.0-dev_0.20.12-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "2ee081d9c155d8e92eb97714d1822a11f779d8ccaf93e0343466c34bc5af538f"
SRC_URI[deb2.md5sum] = "88b90cae8bf74d8586c290e1aee1183c"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-freedesktop gir1.2-glib-2.0 gir1.2-gssdp-1.0 gir1.2-soup-2.4 libgupnp-1.0-4 (>= 0.20.12)"
RDEPENDS_lib${PN}-1.0-4 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.37.3) libgssdp-1.0-3 (>= 0.14.0) libsoup2.4-1 (>= 2.34.0-1~) libuuid1 (>= 2.16) libxml2 (>= 2.7.4) shared-mime-info"
RDEPENDS_lib${PN}-1.0-dev = "libgupnp-1.0-4 (= 0.20.12-1) gir1.2-gupnp-1.0 (= 0.20.12-1) libgssdp-1.0-dev (>= 0.6.1) libsoup2.4-dev libxml2-dev uuid-dev"
DEPENDS = "libgssdp-1.0-3 gir1.2-glib-2.0 libsoup2.4-dev libc6 libuuid1 libsoup2.4-1 libgssdp-1.0-dev gir1.2-freedesktop libglib2.0-0 libxml2-dev gir1.2-gssdp-1.0 libxml2 shared-mime-info uuid-dev gir1.2-soup-2.4"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gir1.2-gupnp-1.0 = " \
    ./usr/lib/girepository-1.0/GUPnP-1.0.typelib \
    ./usr/share/doc/gir1.2-gupnp-1.0/AUTHORS \
    ./usr/share/doc/gir1.2-gupnp-1.0/NEWS.gz \
    ./usr/share/doc/gir1.2-gupnp-1.0/README \
    ./usr/share/doc/gir1.2-gupnp-1.0/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-gupnp-1.0/copyright\
"
FILES_libgupnp-1.0-4 = " \
    ./usr/lib/libgupnp-1.0.so.4 \
    ./usr/lib/libgupnp-1.0.so.4.0.0 \
    ./usr/share/doc/libgupnp-1.0-4/AUTHORS \
    ./usr/share/doc/libgupnp-1.0-4/NEWS.gz \
    ./usr/share/doc/libgupnp-1.0-4/README \
    ./usr/share/doc/libgupnp-1.0-4/changelog.Debian.gz \
    ./usr/share/doc/libgupnp-1.0-4/copyright\
"
FILES_libgupnp-1.0-dev = " \
    ./usr/bin/gupnp-binding-tool \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-acl.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-context-manager.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-context.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-control-point.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-device-info.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-device-proxy.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-device.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-error.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-resource-factory.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-root-device.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-service-info.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-service-introspection.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-service-proxy.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-service.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-types.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-white-list.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-xml-doc.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp.h \
    ./usr/lib/libgupnp-1.0.a \
    ./usr/lib/libgupnp-1.0.so \
    ./usr/lib/pkgconfig/gupnp-1.0.pc \
    ./usr/share/doc/libgupnp-1.0-dev/AUTHORS \
    ./usr/share/doc/libgupnp-1.0-dev/NEWS.gz \
    ./usr/share/doc/libgupnp-1.0-dev/README \
    ./usr/share/doc/libgupnp-1.0-dev/changelog.Debian.gz \
    ./usr/share/doc/libgupnp-1.0-dev/copyright \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-browsing.c.gz \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-introspection.c.gz \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-proxy.c.gz \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-server.c.gz \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-white-list.c.gz \
    ./usr/share/gir-1.0/GUPnP-1.0.gir \
    ./usr/share/man/man1/gupnp-binding-tool.1.gz \
    ./usr/share/vala/vapi/gupnp-1.0.deps \
    ./usr/share/vala/vapi/gupnp-1.0.vapi\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
