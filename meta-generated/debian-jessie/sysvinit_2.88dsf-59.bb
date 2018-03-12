PACKAGES = "${PN} initscripts sysv-rc sysvinit-utils"
PROVIDES = "initscripts sysv-rc sysvinit-utils"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/sysvinit/initscripts_2.88dsf-59_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/s/sysvinit/sysv-rc_2.88dsf-59_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/s/sysvinit/sysvinit-utils_2.88dsf-59_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_initscripts = "initscripts_2.88dsf-59_armhf.deb"
SRC_URI[deb0.sha256sum] = "12ceaa40e0e8fdc0357020cc711839f4c4163a39e15b3162bb6d968863251a74"
SRC_URI[deb0.md5sum] = "c7d9ba049433d975994ce6f5b95f8d99"
DEBFILENAME_sysv-rc = "sysv-rc_2.88dsf-59_all.deb"
SRC_URI[deb1.sha256sum] = "da964cb1d9016ebbb65667b1ec743bbec06d817278d4038e15292ce554f835da"
SRC_URI[deb1.md5sum] = "0ed4ac245bbb6e0dbde36613151bc393"
DEBFILENAME_sysvinit-utils = "sysvinit-utils_2.88dsf-59_armhf.deb"
SRC_URI[deb2.sha256sum] = "18c9d877ce34efcdd47529b25c79035585be5c8bd508fb48c603ccb85cb7d054"
SRC_URI[deb2.md5sum] = "dd340a6a15007d814510ba4fb71ebde8"

RDEPENDS_initscripts = "libc6 (>= 2.4) debianutils (>= 4) lsb-base (>= 3.2-14) sysvinit-utils (>= 2.88dsf-50) sysv-rc coreutils (>= 5.93)"
RDEPENDS_sysv-rc = "debconf (>= 0.5) sysvinit-utils (>= 2.86.ds1-62) insserv (>> 1.12.0-10) startpar"
RDEPENDS_${PN}-utils = "libc6 (>= 2.7) libselinux1 (>= 1.32) startpar"
DEPENDS = "insserv coreutils startpar debconf libc6 debianutils libselinux1 lsb-base"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_initscripts = " \
    ./usr/share/man/man5/halt.5.gz \
    ./lib/init/bootclean.sh \
    ./etc/init.d/bootlogs \
    ./etc/init.d/umountfs \
    ./usr/share/lintian/overrides/initscripts \
    ./lib/init/mount-functions.sh \
    ./etc/network/if-up.d/mountnfs \
    ./usr/share/man/man5/tmpfs.5.gz \
    ./usr/share/man/man1/mountpoint.1.gz \
    ./etc/init.d/umountnfs.sh \
    ./etc/init.d/killprocs \
    ./lib/init/swap-functions.sh \
    ./usr/share/doc/initscripts/changelog.Debian.gz \
    ./usr/share/doc/initscripts/changelog.gz \
    ./etc/init.d/single \
    ./etc/init.d/checkfs.sh \
    ./etc/default/devpts \
    ./etc/init.d/rmnologin \
    ./usr/share/doc/initscripts/copyright \
    ./bin/mountpoint \
    ./etc/init.d/halt \
    ./etc/init.d/hostname.sh \
    ./sbin/fsck.nfs \
    ./etc/init.d/mountnfs-bootclean.sh \
    ./etc/init.d/checkroot.sh \
    ./etc/init.d/motd \
    ./etc/init.d/mountall.sh \
    ./etc/init.d/mountall-bootclean.sh \
    ./usr/share/doc/initscripts/NEWS.Debian.gz \
    ./etc/init.d/umountroot \
    ./etc/init.d/urandom \
    ./etc/init.d/mountnfs.sh \
    ./usr/share/man/man5/rcS.5.gz \
    ./etc/default/rcS \
    ./etc/init.d/sendsigs \
    ./etc/init.d/mountdevsubfs.sh \
    ./etc/default/halt \
    ./usr/share/doc/initscripts/README.Debian \
    ./lib/init/vars.sh \
    ./etc/init.d/mountkernfs.sh \
    ./lib/init/tmpfs.sh \
    ./etc/init.d/bootmisc.sh \
    ./etc/init.d/reboot \
    ./etc/init.d/skeleton \
    ./etc/default/tmpfs \
    ./usr/share/man/man8/fsck.nfs.8.gz \
    ./etc/init.d/checkroot-bootclean.sh \
    ./etc/init.d/rc.local\
"
FILES_sysv-rc = " \
    ./etc/init.d/rcS \
    ./etc/rc6.d/README \
    ./usr/sbin/invoke-rc.d \
    ./etc/init.d/rc \
    ./usr/share/doc/sysv-rc/changelog.Debian.gz \
    ./usr/share/man/man8/invoke-rc.d.8.gz \
    ./usr/share/man/man8/update-rc.d.8.gz \
    ./etc/rcS.d/README \
    ./usr/sbin/update-rc.d \
    ./etc/rc4.d/README \
    ./etc/rc1.d/README \
    ./usr/share/doc/sysv-rc/README.policy-rc.d.gz \
    ./usr/share/doc/sysv-rc/README.Debian \
    ./usr/share/doc/sysv-rc/copyright \
    ./usr/share/sysv-rc/saveconfig \
    ./etc/rc2.d/README \
    ./usr/share/doc/sysv-rc/README.invoke-rc.d.gz \
    ./usr/share/doc/sysv-rc/changelog.gz \
    ./etc/rc5.d/README \
    ./usr/share/doc/sysv-rc/README.runlevels.gz \
    ./usr/share/doc/sysv-rc/NEWS.Debian.gz \
    ./etc/rc3.d/README \
    ./etc/rc0.d/README \
    ./usr/share/lintian/overrides/sysv-rc \
    ./etc/init.d/README\
"
FILES_sysvinit-utils = " \
    ./sbin/sulogin \
    ./usr/share/man/man8/killall5.8.gz \
    ./usr/bin/mesg \
    ./usr/sbin/service \
    ./usr/share/man/man1/mesg.1.gz \
    ./lib/init/init-d-script \
    ./usr/share/man/man5/init-d-script.5.gz \
    ./usr/bin/lastb \
    ./sbin/fstab-decode \
    ./usr/share/man/man8/service.8.gz \
    ./usr/share/man/man8/sulogin.8.gz \
    ./usr/share/doc/sysvinit-utils/changelog.Debian.gz \
    ./sbin/killall5 \
    ./usr/share/doc/sysvinit-utils/copyright \
    ./usr/bin/last \
    ./usr/share/doc/sysvinit-utils/changelog.gz \
    ./usr/share/man/man1/last.1.gz \
    ./usr/share/man/man1/lastb.1.gz \
    ./usr/share/man/man8/pidof.8.gz \
    ./usr/share/man/man8/fstab-decode.8.gz \
    ./bin/pidof \
    ./usr/share/doc/sysvinit-utils/NEWS.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
