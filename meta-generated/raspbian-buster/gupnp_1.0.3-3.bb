PACKAGES = "${PN} gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
PROVIDES = "gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/gir1.2-gupnp-1.0_1.0.3-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-4_1.0.3-3_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-dev_1.0.3-3_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gupnp-1.0 = "gir1.2-gupnp-1.0_1.0.3-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "52333a005d75eb10c504f98e414c5c143eaaecb84b6fc420c385f08da0ff77cb"
SRC_URI[deb0.md5sum] = "5dcc4d0c9d5c72941f5ce7f77da543e7"
DEBFILENAME_libgupnp-1.0-4 = "libgupnp-1.0-4_1.0.3-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "6e38b555d6c945f37e0a56d8133007b448562a0a64e3998844c138c6c2e2a0a0"
SRC_URI[deb1.md5sum] = "c481e11da6b6c4e9c0d44021e2286cd4"
DEBFILENAME_libgupnp-1.0-dev = "libgupnp-1.0-dev_1.0.3-3_armhf.deb"
SRC_URI[deb2.sha256sum] = "7f512b30873e06f3a15b5abf8a2c6083acc1cb316207bf1a65c788ff3c0d7283"
SRC_URI[deb2.md5sum] = "0bb046b8bcb03694437db00edd94d7f4"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-freedesktop (>= 0.10.7-1~) gir1.2-glib-2.0 (>= 0.10.7-1~) gir1.2-gssdp-1.0 (>= 0.14.15) gir1.2-soup-2.4 (>= 2.48.0) libgupnp-1.0-4 (>= 0.20.16)"
RDEPENDS_lib${PN}-1.0-4 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.90) libgssdp-1.0-3 (>= 0.14.16) libsoup2.4-1 (>= 2.48.0) libuuid1 (>= 2.16) libxml2 (>= 2.7.4) shared-mime-info"
RDEPENDS_lib${PN}-1.0-dev = "gir1.2-gupnp-1.0 (= 1.0.3-3) libgssdp-1.0-dev (>= 0.14.13) libgupnp-1.0-4 (= 1.0.3-3) libsoup2.4-dev libxml2-dev python3 uuid-dev"
DEPENDS = "gir1.2-freedesktop gir1.2-glib-2.0 gir1.2-gssdp-1.0 gir1.2-soup-2.4 libc6 libglib2.0-0 libgssdp-1.0-3 libgssdp-1.0-dev libsoup2.4-1 libsoup2.4-dev libuuid1 libxml2 libxml2-dev python3 shared-mime-info uuid-dev"


inherit deb_group

FILES_gir1.2-gupnp-1.0 = " \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/GUPnP-1.0.typelib \
    ./usr/share/doc/gir1.2-gupnp-1.0/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-gupnp-1.0/copyright\
"
FILES_libgupnp-1.0-4 = " \
    ./usr/lib/arm-linux-gnueabihf/libgupnp-1.0.so.4 \
    ./usr/lib/arm-linux-gnueabihf/libgupnp-1.0.so.4.0.1 \
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
    ./usr/include/gupnp-1.0/libgupnp/gupnp-uuid.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-white-list.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp-xml-doc.h \
    ./usr/include/gupnp-1.0/libgupnp/gupnp.h \
    ./usr/lib/arm-linux-gnueabihf/libgupnp-1.0.a \
    ./usr/lib/arm-linux-gnueabihf/libgupnp-1.0.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gupnp-1.0.pc \
    ./usr/share/doc/libgupnp-1.0-dev/changelog.Debian.gz \
    ./usr/share/doc/libgupnp-1.0-dev/copyright \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-browsing.c \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-introspection.c \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-proxy.c \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-server.c \
    ./usr/share/doc/libgupnp-1.0-dev/examples/test-white-list.c \
    ./usr/share/gir-1.0/GUPnP-1.0.gir \
    ./usr/share/man/man1/gupnp-binding-tool.1.gz \
    ./usr/share/vala/vapi/gupnp-1.0.deps \
    ./usr/share/vala/vapi/gupnp-1.0.vapi\
"
