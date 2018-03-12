PACKAGES = "${PN} libcairo-gobject2 libcairo2"
PROVIDES = "libcairo-gobject2 libcairo2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo-gobject2_1.14.0-2.1+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo2_1.14.0-2.1+deb8u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libcairo-gobject2 = "libcairo-gobject2_1.14.0-2.1+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "2bd7a5b40167c690c69841e11ec59fee75b8fcc49f1536c489bdb444cdd70734"
SRC_URI[deb0.md5sum] = "35c965a001f77a23424cb0ec50c07de3"
DEBFILENAME_libcairo2 = "libcairo2_1.14.0-2.1+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "4f2bc9134df54aef0e7008ddc2d9b47a268a4080bb53d554d76683dd32f272de"
SRC_URI[deb1.md5sum] = "909befa96c88f06acfc497fc17b8bc27"

RDEPENDS_lib${PN}-gobject2 = "libc6 (>= 2.4) libcairo2 (>= 1.10.0) libglib2.0-0 (>= 2.14.0)"
RDEPENDS_lib${PN}2 = "libc6 (>= 2.11) libfontconfig1 (>= 2.11) libfreetype6 (>= 2.3.5) libpixman-1-0 (>= 0.30.0) libpng12-0 (>= 1.2.13-4) libx11-6 libxcb-render0 libxcb-shm0 libxcb1 (>= 1.6) libxext6 libxrender1 zlib1g (>= 1:1.1.4)"
DEPENDS = "libfontconfig1 libpng12-0 libpixman-1-0 libxcb-render0 libxcb1 libxcb-shm0 libxext6 zlib1g libglib2.0-0 libc6 libfreetype6 libx11-6 libxrender1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libcairo-gobject2 = " \
    ./usr/share/doc/libcairo-gobject2/copyright \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2 \
    ./usr/share/doc/libcairo-gobject2/changelog.gz \
    ./usr/share/doc/libcairo-gobject2/README.gz \
    ./usr/share/doc/libcairo-gobject2/NEWS.gz \
    ./usr/share/doc/libcairo-gobject2/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2.11400.0 \
    ./usr/share/doc/libcairo-gobject2/AUTHORS.gz\
"
FILES_libcairo2 = " \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2 \
    ./usr/share/doc/libcairo2/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libcairo.so.2.11400.0 \
    ./usr/share/doc/libcairo2/AUTHORS.gz \
    ./usr/share/doc/libcairo2/copyright \
    ./usr/share/doc/libcairo2/changelog.gz \
    ./usr/share/doc/libcairo2/README.gz \
    ./usr/share/doc/libcairo2/NEWS.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
