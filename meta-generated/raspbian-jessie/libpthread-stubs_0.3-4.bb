PACKAGES = "libpthread-stubs0-dev"
PROVIDES = "libpthread-stubs0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libpthread-stubs/libpthread-stubs0-dev_0.3-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpthread-stubs0-dev = "libpthread-stubs0-dev_0.3-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "b202dd17a3f5f28ce298a905e6cb4599ae557da29441079ea9dc44b8c3b5b9d3"
SRC_URI[deb0.md5sum] = "5a8aabcbd47302fe36c8dd9f5809bce4"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpthread-stubs0-dev = " \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/pthread-stubs.pc \
	./usr/share/doc/libpthread-stubs0-dev/copyright \
	./usr/share/doc/libpthread-stubs0-dev/README \
	./usr/share/doc/libpthread-stubs0-dev/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
