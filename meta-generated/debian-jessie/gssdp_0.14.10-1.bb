PACKAGES = "${PN} gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
PROVIDES = "gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/gir1.2-gssdp-1.0_0.14.10-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/libgssdp-1.0-3_0.14.10-1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/gssdp/libgssdp-1.0-dev_0.14.10-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gssdp-1.0 = "gir1.2-gssdp-1.0_0.14.10-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "5298fd0dd7d5ee4de6c736131723547cf4079447d679bbae47a3cf27e622c1a2"
SRC_URI[deb0.md5sum] = "696caf469647b2b85a24d96ae9a06b0f"
DEBFILENAME_libgssdp-1.0-3 = "libgssdp-1.0-3_0.14.10-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "34fc630ef919e4bbfe2a72b9f9f890521efbbe98277ec7138d6eec9c68cc7440"
SRC_URI[deb1.md5sum] = "d90f9fe8ea14711d0d62a54adcb79224"
DEBFILENAME_libgssdp-1.0-dev = "libgssdp-1.0-dev_0.14.10-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "d4436662d68505d4b7ed13edbe51ab3d264fec03c925e3ea565ca961668b8de4"
SRC_URI[deb2.md5sum] = "f41c44cc52d4e79f15fb697e80ee0e03"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-glib-2.0 gir1.2-soup-2.4 libgssdp-1.0-3 (>= 0.14.8)"
RDEPENDS_lib${PN}-1.0-3 = "libc6 (>= 2.7) libglib2.0-0 (>= 2.37.3) libsoup2.4-1 (>= 2.26.1)"
RDEPENDS_lib${PN}-1.0-dev = "libgssdp-1.0-3 (= 0.14.10-1) gir1.2-gssdp-1.0 (= 0.14.10-1) libsoup2.4-dev"
DEPENDS = "gir1.2-soup-2.4 libglib2.0-0 libsoup2.4-1 libc6 libsoup2.4-dev gir1.2-glib-2.0"


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
