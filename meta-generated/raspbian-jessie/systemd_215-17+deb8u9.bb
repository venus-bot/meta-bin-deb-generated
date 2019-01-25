PACKAGES = "${PN} libsystemd0"
PROVIDES = "libsystemd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/systemd/libsystemd0_215-17+deb8u9_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsystemd0 = "libsystemd0_215-17+deb8u9_armhf.deb"
SRC_URI[deb0.sha256sum] = "74662451faa6edb1b044c34c214cb6ad07c0c1c8fc7041afdd07695d61197ea3"
SRC_URI[deb0.md5sum] = "4e39ca335cbde9b78d8a180d4bf63d75"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsystemd0 = " \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0 \
    ./lib/arm-linux-gnueabihf/libsystemd.so.0.3.1 \
    ./usr/share/doc/libsystemd0/changelog.Debian.gz \
    ./usr/share/doc/libsystemd0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
