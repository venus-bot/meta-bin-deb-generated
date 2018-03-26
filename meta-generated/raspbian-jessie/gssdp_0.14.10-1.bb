PACKAGES = "${PN} gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
PROVIDES = "gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/gir1.2-gssdp-1.0_0.14.10-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/libgssdp-1.0-3_0.14.10-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/libgssdp-1.0-dev_0.14.10-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gssdp-1.0 = "gir1.2-gssdp-1.0_0.14.10-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "741496f1ea9c08367d6b6425738bcc86deb6566f655f233de574055f2cc87b54"
SRC_URI[deb0.md5sum] = "2e7b53a555c05559862e5bb97ac67add"
DEBFILENAME_libgssdp-1.0-3 = "libgssdp-1.0-3_0.14.10-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "d0433eb007ce39f4f24f43f3eeda97a9fa8130502caf7e03ed17a601418f72d0"
SRC_URI[deb1.md5sum] = "0d3934b6fd1b23f98c4ec3b6116341c9"
DEBFILENAME_libgssdp-1.0-dev = "libgssdp-1.0-dev_0.14.10-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "619733bd7e8ac605dacbd6f5dacbe42a5f08e435d8dc061532e51fbb15e579a7"
SRC_URI[deb2.md5sum] = "9d4a2484147f525dbf6b4a24c302fcc7"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-glib-2.0 gir1.2-soup-2.4 libgssdp-1.0-3 (>= 0.14.8)"
RDEPENDS_lib${PN}-1.0-3 = "libc6 (>= 2.7) libglib2.0-0 (>= 2.37.3) libsoup2.4-1 (>= 2.26.1)"
RDEPENDS_lib${PN}-1.0-dev = "libgssdp-1.0-3 (= 0.14.10-1) gir1.2-gssdp-1.0 (= 0.14.10-1) libsoup2.4-dev"
DEPENDS = "gir1.2-glib-2.0 libglib2.0-0 libsoup2.4-1 libsoup2.4-dev libc6 gir1.2-soup-2.4"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gir1.2-gssdp-1.0 = " \
    ./usr/lib/girepository-1.0/GSSDP-1.0.typelib \
    ./usr/share/doc/gir1.2-gssdp-1.0/AUTHORS \
    ./usr/share/doc/gir1.2-gssdp-1.0/NEWS.gz \
    ./usr/share/doc/gir1.2-gssdp-1.0/README \
    ./usr/share/doc/gir1.2-gssdp-1.0/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-gssdp-1.0/copyright\
"
FILES_libgssdp-1.0-3 = " \
    ./usr/lib/libgssdp-1.0.so.3 \
    ./usr/lib/libgssdp-1.0.so.3.0.0 \
    ./usr/share/doc/libgssdp-1.0-3/AUTHORS \
    ./usr/share/doc/libgssdp-1.0-3/NEWS.gz \
    ./usr/share/doc/libgssdp-1.0-3/README \
    ./usr/share/doc/libgssdp-1.0-3/changelog.Debian.gz \
    ./usr/share/doc/libgssdp-1.0-3/copyright\
"
FILES_libgssdp-1.0-dev = " \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-client.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-error.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-resource-browser.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp-resource-group.h \
    ./usr/include/gssdp-1.0/libgssdp/gssdp.h \
    ./usr/lib/libgssdp-1.0.a \
    ./usr/lib/libgssdp-1.0.so \
    ./usr/lib/pkgconfig/gssdp-1.0.pc \
    ./usr/share/doc/libgssdp-1.0-dev/AUTHORS \
    ./usr/share/doc/libgssdp-1.0-dev/NEWS.gz \
    ./usr/share/doc/libgssdp-1.0-dev/README \
    ./usr/share/doc/libgssdp-1.0-dev/changelog.Debian.gz \
    ./usr/share/doc/libgssdp-1.0-dev/copyright \
    ./usr/share/gir-1.0/GSSDP-1.0.gir \
    ./usr/share/vala/vapi/gssdp-1.0.deps \
    ./usr/share/vala/vapi/gssdp-1.0.vapi\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
