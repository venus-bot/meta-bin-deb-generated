PACKAGES = "${PN} libelfg0"
PROVIDES = "libelfg0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libe/libelf/libelfg0_0.8.13-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libelfg0 = "libelfg0_0.8.13-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "1427768f8da4ecfa097128fba3d1a6440748a81465282b26bd0200e20d9136bd"
SRC_URI[deb0.md5sum] = "652ac86ee984f9be43df4e7f8d023cc4"

RDEPENDS_${PN}g0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libelfg0 = " \
    ./usr/lib/arm-linux-gnueabihf/libelf.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libelf.so.0.8.13 \
    ./usr/share/doc/libelfg0/README.gz \
    ./usr/share/doc/libelfg0/changelog.Debian.gz \
    ./usr/share/doc/libelfg0/changelog.gz \
    ./usr/share/doc/libelfg0/copyright \
    ./usr/share/locale/de/LC_MESSAGES/libelf.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
