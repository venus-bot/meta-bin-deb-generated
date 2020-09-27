PACKAGES = "${PN} gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
PROVIDES = "gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/gir1.2-gupnp-1.0_1.0.5-0+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-4_1.0.5-0+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-dev_1.0.5-0+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gupnp-1.0 = "gir1.2-gupnp-1.0_1.0.5-0+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "775b15970f72055e8d8fdc27dd47a09922834640b6c6b31bbd44fceeb377164d"
SRC_URI[deb0.md5sum] = "89fa0ac1225cd23d5b9588da3d4b5fbd"
DEBFILENAME_libgupnp-1.0-4 = "libgupnp-1.0-4_1.0.5-0+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "ae29efced7992561ba7090826b0c8632bba18516363312aca7f6d31ef2d38ea6"
SRC_URI[deb1.md5sum] = "0f9e87e00fa603d97b867d20ecf1571f"
DEBFILENAME_libgupnp-1.0-dev = "libgupnp-1.0-dev_1.0.5-0+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "9ecbcadd02e65b215bee231dd3972895e85968f9e9900a1b764573103547b9ca"
SRC_URI[deb2.md5sum] = "1cbef50395063a46c900441cd56618de"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-freedesktop (>= 0.10.7-1~) gir1.2-glib-2.0 (>= 0.10.7-1~) gir1.2-gssdp-1.0 (>= 1.0.5) gir1.2-soup-2.4 (>= 2.48.0) libgupnp-1.0-4 (>= 0.20.16)"
RDEPENDS_lib${PN}-1.0-4 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.90) libgssdp-1.0-3 (>= 1.0.5) libsoup2.4-1 (>= 2.48.0) libuuid1 (>= 2.16) libxml2 (>= 2.7.4) shared-mime-info"
RDEPENDS_lib${PN}-1.0-dev = "gir1.2-gupnp-1.0 (= 1.0.5-0+deb10u1) libgssdp-1.0-dev (>= 0.14.13) libgupnp-1.0-4 (= 1.0.5-0+deb10u1) libsoup2.4-dev libxml2-dev python3 uuid-dev"
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
