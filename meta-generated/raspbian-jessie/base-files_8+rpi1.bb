PACKAGES = "${PN} base-files"
PROVIDES = "base-files"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/base-files/base-files_8+rpi1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-files = "base-files_8+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8770d48eec724aac2c8a8afa986bc7d60fd8d3e43a37d3f3b432bdb422bca4fc"
SRC_URI[deb0.md5sum] = "9d6104d024c42c6cb9e6f36d2b98f77d"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/doc/base-files/README \
    ./usr/share/doc/base-files/changelog.gz \
    ./usr/share/common-licenses/GPL \
    ./usr/lib/os-release \
    ./usr/share/common-licenses/Apache-2.0 \
    ./usr/share/base-files/profile.md5sums \
    ./usr/share/common-licenses/GFDL \
    ./usr/share/doc/base-files/README.FHS \
    ./usr/share/common-licenses/GPL-1 \
    ./usr/share/common-licenses/GFDL-1.2 \
    ./usr/share/common-licenses/Artistic \
    ./usr/share/common-licenses/LGPL-2.1 \
    ./usr/share/base-files/staff-group-for-usr-local \
    ./usr/share/base-files/dot.bashrc \
    ./usr/share/lintian/overrides/base-files \
    ./etc/dpkg/origins/debian \
    ./etc/issue \
    ./etc/os-release \
    ./etc/dpkg/origins/raspbian \
    ./usr/share/base-files/nsswitch.conf \
    ./etc/debian_version \
    ./usr/share/base-files/info.dir \
    ./usr/share/common-licenses/LGPL \
    ./usr/share/doc/base-files/FAQ \
    ./usr/share/base-files/nsswitch.conf.md5sums \
    ./usr/share/doc/base-files/copyright \
    ./usr/share/base-files/motd \
    ./usr/share/base-files/profile \
    ./usr/share/common-licenses/GPL-2 \
    ./usr/share/common-licenses/GFDL-1.3 \
    ./usr/share/common-licenses/GPL-3 \
    ./etc/host.conf \
    ./usr/share/common-licenses/LGPL-2 \
    ./usr/share/common-licenses/BSD \
    ./usr/share/common-licenses/LGPL-3 \
    ./etc/issue.net \
    ./usr/share/base-files/dot.profile\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
