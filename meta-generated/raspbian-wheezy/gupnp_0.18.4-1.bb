PACKAGES = "gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
PROVIDES = "gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/gir1.2-gupnp-1.0_0.18.4-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-4_0.18.4-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gupnp/libgupnp-1.0-dev_0.18.4-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gupnp-1.0 = "gir1.2-gupnp-1.0_0.18.4-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "f26fb14fe4b7a149d05c2c2a5b98b54348f9d0b72999e4c4b216d0232a3d1b8a"
SRC_URI[deb0.md5sum] = "917ac1cdb2c3124f67b643a92de663c4"
DEBFILENAME_libgupnp-1.0-4 = "libgupnp-1.0-4_0.18.4-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "c0914d06f7762c0f07b5997f2b096ceefa4d0c468d71a34f8ad1e1d4266b6865"
SRC_URI[deb1.md5sum] = "7f6de4e79ee1b23775f953b8b6af07b8"
DEBFILENAME_libgupnp-1.0-dev = "libgupnp-1.0-dev_0.18.4-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "71d8b9e2885ab315ef33e239610af8002cdad0467a50f73163c68e9163f7b67e"
SRC_URI[deb2.md5sum] = "66cc96d6de4562c5ecf8b403429028e9"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-freedesktop gir1.2-glib-2.0 gir1.2-gssdp-1.0 gir1.2-soup-2.4 libgupnp-1.0-4 (>= 0.18.0)"
RDEPENDS_lib${PN}-1.0-4 = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.8) libgssdp-1.0-3 (>= 0.12.0) libsoup2.4-1 (>= 2.34.0-1~) libuuid1 (>= 2.16) libxml2 (>= 2.7.4) shared-mime-info"
RDEPENDS_lib${PN}-1.0-dev = "libgupnp-1.0-4 (= 0.18.4-1) gir1.2-gupnp-1.0 libgssdp-1.0-dev (>= 0.6.1) libsoup2.4-dev libxml2-dev"
DEPENDS = "libglib2.0-0 shared-mime-info libgssdp-1.0-dev libgssdp-1.0-3 gir1.2-gssdp-1.0 libxml2 gir1.2-glib-2.0 gir1.2-soup-2.4 libc6 gir1.2-freedesktop libsoup2.4-1 libsoup2.4-dev libuuid1 libxml2-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gir1.2-gupnp-1.0 = " \
	./usr/share/doc/gir1.2-gupnp-1.0/NEWS.gz \
	./usr/share/doc/gir1.2-gupnp-1.0/changelog.Debian.gz \
	./usr/share/doc/gir1.2-gupnp-1.0/README \
	./usr/share/doc/gir1.2-gupnp-1.0/AUTHORS \
	./usr/lib/girepository-1.0/GUPnP-1.0.typelib \
	./usr/share/doc/gir1.2-gupnp-1.0/copyright\
"
FILES_libgupnp-1.0-4 = " \
	./usr/share/doc/libgupnp-1.0-4/changelog.Debian.gz \
	./usr/share/doc/libgupnp-1.0-4/README \
	./usr/share/doc/libgupnp-1.0-4/NEWS.gz \
	./usr/lib/libgupnp-1.0.so.4.0.0 \
	./usr/share/doc/libgupnp-1.0-4/AUTHORS \
	./usr/share/doc/libgupnp-1.0-4/copyright \
	./usr/lib/libgupnp-1.0.so.4\
"
FILES_libgupnp-1.0-dev = " \
	./usr/share/man/man1/gupnp-binding-tool.1.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service-introspection.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-xml-doc.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-error.h \
	./usr/lib/pkgconfig/gupnp-1.0.pc \
	./usr/share/doc/libgupnp-1.0-dev/NEWS.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-device-proxy.h \
	./usr/share/doc/libgupnp-1.0-dev/changelog.Debian.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-device.h \
	./usr/bin/gupnp-binding-tool \
	./usr/include/gupnp-1.0/libgupnp/gupnp-context.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-device-info.h \
	./usr/share/gir-1.0/GUPnP-1.0.gir \
	./usr/include/gupnp-1.0/libgupnp/gupnp-root-device.h \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-browsing.c.gz \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-server.c.gz \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-proxy.c.gz \
	./usr/share/doc/libgupnp-1.0-dev/copyright \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service-proxy.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-context-manager.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service-info.h \
	./usr/share/doc/libgupnp-1.0-dev/README \
	./usr/lib/libgupnp-1.0.a \
	./usr/include/gupnp-1.0/libgupnp/gupnp-control-point.h \
	./usr/share/doc/libgupnp-1.0-dev/AUTHORS \
	./usr/include/gupnp-1.0/libgupnp/gupnp-types.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp.h \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-introspection.c.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-resource-factory.h \
	./usr/lib/libgupnp-1.0.so\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
